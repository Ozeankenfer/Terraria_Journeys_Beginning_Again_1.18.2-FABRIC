package net.ozeankenfer.terraria_journeys_beginning_again.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.ozeankenfer.terraria_journeys_beginning_again.Terraria_Journeys_Beginning_Again;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {

		Terraria_Journeys_Beginning_Again.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
