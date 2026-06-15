public class Day9 {

    // Login
    sealed interface LoginResult
            permits LoginSuccess, LoginFailure, LoginLoading {
    }

    record LoginSuccess(String username) implements LoginResult {
    }

    record LoginFailure(String reason) implements LoginResult {
    }

    record LoginLoading(String message) implements LoginResult {
    }

    static void handleLogin(LoginResult result) {
        switch (result) {
            case LoginSuccess success ->
                    System.out.println("Login Successful : " + success.username());

            case LoginFailure failure ->
                    System.out.println("Login Failed because of " + failure.reason());

            case LoginLoading loading ->
                    System.out.println("Login Loading... " + loading.message());
        }
    }

    public static void main(String[] args) {

        LoginResult loginSuccess =
                new LoginSuccess("John");

        LoginResult loginFailure =
                new LoginFailure("Invalid Password");

        LoginResult loginLoading =
                new LoginLoading("Please wait...");

        handleLogin(loginSuccess);
        handleLogin(loginFailure);
        handleLogin(loginLoading);
    }
}
