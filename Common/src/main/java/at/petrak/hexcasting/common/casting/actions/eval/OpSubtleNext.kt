package at.petrak.hexcasting.common.casting.actions.eval

import at.petrak.hexcasting.api.HexAPI
import at.petrak.hexcasting.api.casting.RenderedSpell
import at.petrak.hexcasting.api.casting.castables.Action
import at.petrak.hexcasting.api.casting.castables.ConstMediaAction
import at.petrak.hexcasting.api.casting.castables.SpellAction
import at.petrak.hexcasting.api.casting.eval.CastingEnvironment
import at.petrak.hexcasting.api.casting.eval.OperationResult
import at.petrak.hexcasting.api.casting.eval.vm.CastingImage
import at.petrak.hexcasting.api.casting.eval.vm.SpellContinuation
import at.petrak.hexcasting.api.casting.iota.Iota
import at.petrak.hexcasting.common.lib.hex.HexEvalSounds
import net.minecraft.client.resources.sounds.Sound
import net.minecraft.nbt.CompoundTag

object OpSubtleNext : Action {
    override fun operate(env: CastingEnvironment, image: CastingImage, continuation: SpellContinuation): OperationResult {
        image.userData.putBoolean(HexAPI.SUBTLE_USERDATA, true)

        return OperationResult(
            image.withUsedOp(),
            listOf(),
            continuation,
            HexEvalSounds.NORMAL_EXECUTE
        )
    }

}