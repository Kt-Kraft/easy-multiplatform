import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

public object CornerRadius {
  public val extraSmall: Dp = 12.dp
  public val small: Dp = 50.dp
  public val medium: Dp = 16.dp
  public val large: Dp = 24.dp
  public val extraLarge: Dp = 28.dp
}

public object Size {
  public val bottomBar: Dp = 68.dp
  public val icon: Dp = 28.dp
  public val smallIcon: Dp = 18.dp
  public val fab: Dp = 56.dp
  public val touchTarget: Dp = 40.dp
}

public object Padding {

  public object Widget {
    public val vertical: Dp = 12.dp
    public val horizontal: Dp = 16.dp
    public val values: PaddingValues = PaddingValues(horizontal, vertical)
  }

  public object Screen {
    public val values: PaddingValues get() = PaddingValues(horizontal, vertical)
    public val horizontal: Dp = 12.dp
    public val vertical: Dp = 16.dp
    public val list: PaddingValues = PaddingValues(bottom = bottomBar)
  }

  // Experimentally found out value of the padding Scaffold applies to the fabWithSize
  public val fab: Dp = 16.dp
  public val fabWithSize: Dp = Size.fab + fab
  public val bottomBar: Dp = Size.bottomBar + 4.dp

  public val spacer: Dp = 8.dp
  public val list: PaddingValues = PaddingValues(bottom = fabWithSize)
}

public object Elevation {
  public val none: Dp = 0.dp
  public val small: Dp = 1.dp
  public val normal: Dp = 4.dp
  public val high: Dp = 8.dp
  public val floating: Dp = 12.dp

  public val dialog: Dp = normal
  public val bottomSheet: Dp = 2.dp
}

public object Blur {
  public val lowest: Dp = 2.dp
  public val low: Dp = 4.dp
  public val medium: Dp = 12.dp
  public val high: Dp = 24.dp
  public val acrylic: Dp = 50.dp
}

public object Opacity {
  public const val enabled: Float = 1f
  public const val secondary: Float = 0.85f
  public const val semiTransparent: Float = 0.66f
  public const val scrim: Float = 0.5f
  public const val disabled: Float = 0.38f
  public const val tint: Float = 0.2f
}
