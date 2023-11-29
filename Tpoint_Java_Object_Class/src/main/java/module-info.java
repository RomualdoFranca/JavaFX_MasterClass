module com.example.tpoint_java_object_class {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tpoint_java_object_class to javafx.fxml;
    exports com.example.tpoint_java_object_class;
}