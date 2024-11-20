module HelloSceneBuilder {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	requires java.management;
	requires javafx.media;
	
	opens application to javafx.graphics, javafx.fxml;
}
