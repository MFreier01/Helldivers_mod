package net.hytech.helldivers.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.hytech.helldivers.world.inventory.EagleSmokeGUIMenu;
import net.hytech.helldivers.network.EagleSmokeGUIButtonMessage;
import net.hytech.helldivers.HelldiversMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class EagleSmokeGUIScreen extends AbstractContainerScreen<EagleSmokeGUIMenu> {
	private final static HashMap<String, Object> guistate = EagleSmokeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_eagle_smoke_strike1;
	ImageButton imagebutton_right_arrow;
	ImageButton imagebutton_left_arrow;

	public EagleSmokeGUIScreen(EagleSmokeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 160;
		this.imageHeight = 105;
	}

	private static final ResourceLocation texture = new ResourceLocation("helldivers:textures/screens/eagle_smoke_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("helldivers:textures/screens/eagle_smoke_strike.png"), this.leftPos + 46, this.topPos + 18, 0, 0, 62, 62, 62, 62);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.helldivers.eagle_smoke_gui.label_program_core"), 4, 6, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_eagle_smoke_strike1 = Button.builder(Component.translatable("gui.helldivers.eagle_smoke_gui.button_eagle_smoke_strike1"), e -> {
			if (true) {
				HelldiversMod.PACKET_HANDLER.sendToServer(new EagleSmokeGUIButtonMessage(0, x, y, z));
				EagleSmokeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 81, 119, 20).build();
		guistate.put("button:button_eagle_smoke_strike1", button_eagle_smoke_strike1);
		this.addRenderableWidget(button_eagle_smoke_strike1);
		imagebutton_right_arrow = new ImageButton(this.leftPos + 124, this.topPos + 39, 16, 16, 0, 0, 16, new ResourceLocation("helldivers:textures/screens/atlas/imagebutton_right_arrow.png"), 16, 32, e -> {
			if (true) {
				HelldiversMod.PACKET_HANDLER.sendToServer(new EagleSmokeGUIButtonMessage(1, x, y, z));
				EagleSmokeGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_right_arrow", imagebutton_right_arrow);
		this.addRenderableWidget(imagebutton_right_arrow);
		imagebutton_left_arrow = new ImageButton(this.leftPos + 13, this.topPos + 39, 16, 16, 0, 0, 16, new ResourceLocation("helldivers:textures/screens/atlas/imagebutton_left_arrow.png"), 16, 32, e -> {
			if (true) {
				HelldiversMod.PACKET_HANDLER.sendToServer(new EagleSmokeGUIButtonMessage(2, x, y, z));
				EagleSmokeGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_left_arrow", imagebutton_left_arrow);
		this.addRenderableWidget(imagebutton_left_arrow);
	}
}
