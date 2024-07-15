package net.hytech.helldivers.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.hytech.helldivers.world.inventory.ProgramGUIMenu;
import net.hytech.helldivers.network.ProgramGUIButtonMessage;
import net.hytech.helldivers.HelldiversMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ProgramGUIScreen extends AbstractContainerScreen<ProgramGUIMenu> {
	private final static HashMap<String, Object> guistate = ProgramGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_eagle_air;

	public ProgramGUIScreen(ProgramGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 219;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("helldivers:textures/screens/program_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.helldivers.program_gui.label_program_core"), 10, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_eagle_air = Button.builder(Component.translatable("gui.helldivers.program_gui.button_eagle_air"), e -> {
			if (true) {
				HelldiversMod.PACKET_HANDLER.sendToServer(new ProgramGUIButtonMessage(0, x, y, z));
				ProgramGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 25, 72, 20).build();
		guistate.put("button:button_eagle_air", button_eagle_air);
		this.addRenderableWidget(button_eagle_air);
	}
}
