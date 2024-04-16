package one.khaz.diaryapp.model

import androidx.compose.ui.graphics.Color
import one.khaz.diaryapp.R
import one.khaz.diaryapp.ui.theme.AngryColor
import one.khaz.diaryapp.ui.theme.AwfulColor
import one.khaz.diaryapp.ui.theme.BoredColor
import one.khaz.diaryapp.ui.theme.CalmColor
import one.khaz.diaryapp.ui.theme.DepressedColor
import one.khaz.diaryapp.ui.theme.DisappointedColor
import one.khaz.diaryapp.ui.theme.HappyColor
import one.khaz.diaryapp.ui.theme.HumorousColor
import one.khaz.diaryapp.ui.theme.LonelyColor
import one.khaz.diaryapp.ui.theme.MysteriousColor
import one.khaz.diaryapp.ui.theme.NeutralColor
import one.khaz.diaryapp.ui.theme.RomanticColor
import one.khaz.diaryapp.ui.theme.ShamefulColor
import one.khaz.diaryapp.ui.theme.SurprisedColor
import one.khaz.diaryapp.ui.theme.SuspiciousColor
import one.khaz.diaryapp.ui.theme.TenseColor

enum class Mood(
    val icon: Int,
    val contentColor: Color,
    val containerColor: Color
) {
    Neutral(
        icon = R.drawable.neutral,
        contentColor = Color.Black,
        containerColor = NeutralColor
    ),
    Happy(
        icon = R.drawable.happy,
        contentColor = Color.Black,
        containerColor = HappyColor
    ),
    Angry(
        icon = R.drawable.angry,
        contentColor = Color.White,
        containerColor = AngryColor
    ),
    Bored(
        icon = R.drawable.bored,
        contentColor = Color.Black,
        containerColor = BoredColor
    ),
    Calm(
        icon = R.drawable.calm,
        contentColor = Color.Black,
        containerColor = CalmColor
    ),
    Depressed(
        icon = R.drawable.depressed,
        contentColor = Color.Black,
        containerColor = DepressedColor
    ),
    Disappointed(
        icon = R.drawable.disappointed,
        contentColor = Color.White,
        containerColor = DisappointedColor
    ),
    Humorous(
        icon = R.drawable.humorous,
        contentColor = Color.Black,
        containerColor = HumorousColor
    ),
    Lonely(
        icon = R.drawable.lonely,
        contentColor = Color.White,
        containerColor = LonelyColor
    ),
    Mysterious(
        icon = R.drawable.mysterious,
        contentColor = Color.Black,
        containerColor = MysteriousColor
    ),
    Romantic(
        icon = R.drawable.romantic,
        contentColor = Color.White,
        containerColor = RomanticColor
    ),
    Shameful(
        icon = R.drawable.shameful,
        contentColor = Color.White,
        containerColor = ShamefulColor
    ),
    Awful(
        icon = R.drawable.awful,
        contentColor = Color.Black,
        containerColor = AwfulColor
    ),
    Surprised(
        icon = R.drawable.surprised,
        contentColor = Color.Black,
        containerColor = SurprisedColor
    ),
    Suspicious(
        icon = R.drawable.suspicious,
        contentColor = Color.Black,
        containerColor = SuspiciousColor
    ),
    Tense(
        icon = R.drawable.tense,
        contentColor = Color.Black,
        containerColor = TenseColor
    )

}