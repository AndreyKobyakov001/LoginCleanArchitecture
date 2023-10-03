package use_case;

import entity.User;

public interface SignupInputBoundary {
    void execute(SignupInputData signupInputData);

    interface UserSignupDataAccessInterface {
        boolean existsByName(String identifier);

        void save(User user);
    }
}
