package feature.payment.screen.dashboard

public interface DashboardContract {

  public data class UiState(
    public val isLoading: Boolean = false,
  )

  public sealed interface UiAction

  public sealed interface SideEffect
}
