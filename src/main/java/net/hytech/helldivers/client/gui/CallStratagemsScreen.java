package net.hytech.helldivers.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.hytech.helldivers.world.inventory.CallStratagemsMenu;
import net.hytech.helldivers.network.CallStratagemsButtonMessage;
import net.hytech.helldivers.HelldiversMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CallStratagemsScreen extends AbstractContainerScreen<CallStratagemsMenu> {
	private final static HashMap<String, Object> guistate = CallStratagemsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_up_arrow;
	ImageButton imagebutton_right_arrow;
	ImageButton imagebutton_left_arrow;
	ImageButton imagebutton_down_arrow;

	public CallStratagemsScreen(CallStratagemsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 177;
		this.imageHeight = 187;
	}

	private static final ResourceLocation texture = new ResourceLocation("helldivers:textures/screens/call_stratagems.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.helldivers.call_stratagems.label_call_a_stratagem"), 6, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_up_arrow = new ImageButton(this.leftPos + 45, this.topPos + 21, 16, 16, 0, 0, 16, new ResourceLocation("helldivers:textures/screens/atlas/imagebutton_up_arrow.png"), 16, 32, e -> {
			if (true) {
				HelldiversMod.PACKET_HANDLER.sendToServer(new CallStratagemsButtonMessage(0, x, y, z));
				CallStratagemsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_up_arrow", imagebutton_up_arrow);
		this.addRenderableWidget(imagebutton_up_arrow);
		imagebutton_right_arrow = new ImageButton(this.leftPos + 45, this.topPos + 41, 16, 16, 0, 0, 16, new ResourceLocation("helldivers:textures/screens/atlas/imagebutton_right_arrow.png"), 16, 32, e -> {
			if (true) {
				HelldiversMod.PACKET_HANDLER.sendToServer(new CallStratagemsButtonMessage(1, x, y, z));
				CallStratagemsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_right_arrow", imagebutton_right_arrow);
		this.addRenderableWidget(imagebutton_right_arrow);
		imagebutton_left_arrow = new ImageButton(this.leftPos + 45, this.topPos + 61, 16, 16, 0, 0, 16, new ResourceLocation("helldivers:textures/screens/atlas/imagebutton_left_arrow.png"), 16, 32, e -> {
			if (true) {
				HelldiversMod.PACKET_HANDLER.sendToServer(new CallStratagemsButtonMessage(2, x, y, z));
				CallStratagemsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_left_arrow", imagebutton_left_arrow);
		this.addRenderableWidget(imagebutton_left_arrow);
		imagebutton_down_arrow = new ImageButton(this.leftPos + 45, this.topPos + 81, 16, 16, 0, 0, 16, new ResourceLocation("helldivers:textures/screens/atlas/imagebutton_down_arrow.png"), 16, 32, e -> {
			if (true) {
				HelldiversMod.PACKET_HANDLER.sendToServer(new CallStratagemsButtonMessage(3, x, y, z));
				CallStratagemsButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_down_arrow", imagebutton_down_arrow);
		this.addRenderableWidget(imagebutton_down_arrow);
	}
}
