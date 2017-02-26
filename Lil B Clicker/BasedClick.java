import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BasedClick extends Application{
	
	Button button;
	int cT = 1;
	public static void main(String[] args){
		launch(args);
	}
	public void start(Stage window) throws Exception{
		
		window.setTitle("TYBG");
		
		button = new Button("Cook");
		button.setOnAction(new EventHandler<ActionEvent>(){
		String x1 = "Task Force";
		String x2 = "Swag!";
		
			public void handle(ActionEvent event){
				AlertBoxesDemo.displayAb(x1, x2);
				System.out.println("You cooked "+cT+" times!");
				switch(cT){
				case(5): System.out.println("Woo!");
					break;
				case(10): System.out.println("Skeee!");
					break;
				case(20): System.out.println("Dr. Phil!");
					break;
				case(30): System.out.println("Based God!");
					break;
				case(40): System.out.println("BASEDGOD FMB");
					break;
				case(50): System.out.println("FIGARO!!!");
					break;
				case(75): System.out.println("WOW \nOKAY");
					break;
				case(100): System.out.println("THANK YOU BASEDGOD, YOU SWAG ON 100 TRILLION OHHH MY GOD!!!!!!!!!!!");
					break;
				default: break;}
				cT++;
			} 
		});
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 150, 30);
		
		window.setScene(scene);
		window.show();
		
	}
}
