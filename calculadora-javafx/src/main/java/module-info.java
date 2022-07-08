module com.frankcalc {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.frankcalc to javafx.fxml;
    exports com.frankcalc;
}
