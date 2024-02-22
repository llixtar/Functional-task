package app.controler;

import app.view.AppView;
import app.model.AppUsersModel;
import app.entity.User;

import java.util.List;
import java.util.function.Consumer;

public class AppControler {

    AppUsersModel model = new AppUsersModel();
    AppView view = new AppView();

    public void runApp() {
        handleData(model.getUsers(),getUsersConsumer());
    }

    public void handleData(List<User> list, Consumer<User> consumer) {
        for (User user : list) {
            consumer.accept(user);
        }
    }

    public Consumer<User> getUsersConsumer() {
        return user ->
                view.getOutput(user.toString());
    }


}
