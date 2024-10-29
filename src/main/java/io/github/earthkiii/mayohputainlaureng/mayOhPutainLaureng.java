package io.github.earthkiii.mayohputainlaureng;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.util.ActionResult;

public class mayOhPutainLaureng implements ModInitializer {
    @Override
    public void onInitialize() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (entity instanceof VillagerEntity villager) {
                villager.getVillagerData();
            };
            return ActionResult.PASS;
        });
    }
}
