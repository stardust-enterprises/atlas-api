/**
 * If this compiles i'll be amazed
 */

@Named(
    "net.minecraft.client.Minecraft", 
    "net.minecraft.client.MinecraftClient",
)
interface MappedTest {
    @Named(
        "thePlayer",
        "player"
    )
    val player: PlayerEntity

    companion object {
        @Named(
            "theMinecraft",
            "instance",
        )
        val instance: MappedTest
    }

}

@Named(
    "net.minecraft.client.entity.EntityPlayerSP"
    "net.minecraft.client.entity.EntityClientPlayerMP"
)
interface PlayerEntity


