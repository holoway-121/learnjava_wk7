package tictactoe;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TicTacToeController {

	
	@FXML
    private ImageView imgView1;

    @FXML
    private ImageView imgView2;

    @FXML
    private ImageView imgView3;

    @FXML
    private ImageView imgView4;

    @FXML
    private ImageView imgView6;

    @FXML
    private ImageView imgView5;

    @FXML
    private ImageView imgView9;

    @FXML
    private ImageView imgView8;

    @FXML
    private ImageView imgView7;

    @FXML
    private Button startBtn;
    
    @FXML
    private RadioButton xRdioBtn;

    @FXML
    private RadioButton oRdioBtn;
    
    private Image oImg = new Image("\\wk7\\tictactoe_o.jpg");
    private Image xImg = new Image("\\wk7\\tictactoe_x.jpg");
    
    //private Image[][] gBoard = new Image[3][3];
    /*
    {00,01,02},
    {10,11,12},
    {20,21,22}
    */
    
    
    
    
    private int userChoice;
    
    private Image userPickedImg;
    Random rand = new Random();
    
    //Game
    public void start() {
    	if(xRdioBtn.isSelected()) {
    		userChoice = 0;
    		userPickedImg = xImg;
    	}
    	else {
    		userChoice = 1;
    		userPickedImg = oImg;
    	}
    }
    
    public void userPlay() {
    	if(userChoice == 0) {
    		userPickedImg = oImg;
    		userChoice = 1;
    		
    	}
    	else if(userChoice == 1) {
    		userPickedImg = xImg;
    		userChoice = 0;
    	}
    	
    	//Call check for winner
    	
    }
    
    
    public void winCheck() {
    	//8 rows to win
    	boolean gameOver = false;
    	String result = "DRAW";
    	
    	//Row 1
    	if(imgView1.getImage() == imgView2.getImage() && imgView1.getImage() == imgView3.getImage()) {
    		//Get image to find the winner
    	}
    	
    	//Row 2
    	if(imgView1.getImage() == imgView2.getImage() && imgView1.getImage() == imgView3.getImage()) {
    		
    	}
    	
    	//Row 3
    	if(imgView1.getImage() == imgView2.getImage() && imgView1.getImage() == imgView3.getImage()) {
    		
    	}
    	
    	//Row 4
    	if(imgView1.getImage() == imgView2.getImage() && imgView1.getImage() == imgView3.getImage()) {
    		
    	}
    	
    	//Row 5
    	if(imgView1.getImage() == imgView2.getImage() && imgView1.getImage() == imgView3.getImage()) {
    		
    	}
    	
    	//Row 6
    	if(imgView1.getImage() == imgView2.getImage() && imgView1.getImage() == imgView3.getImage()) {
    		
    	}
    	
    	//Row 7
    	if(imgView1.getImage() == imgView2.getImage() && imgView1.getImage() == imgView3.getImage()) {
    		
    	}
    	
    	//Row 8
    	if(imgView1.getImage() == imgView2.getImage() && imgView1.getImage() == imgView3.getImage()) {
    		
    	}
    	
    	
    	
    	if(gameOver == true) {
        	Dialog dialog = new Dialog();
            dialog.setTitle("Result");
            dialog.setContentText(result);
            dialog.showAndWait();
    	}

    	
    }
    
    //Play against comp? auto generate numb, check its not set, then play?
    public void compPlay() {
    	int compPick = rand.nextInt(9);
    	
    	
    }
    
    
    public void setImgView1() {
    	if(imgView1.getImage() == null) {
    		imgView1.setImage(userPickedImg);
    		userPlay();
    	}
    }
    
    public void setImgView2() {
    	if(imgView2.getImage() == null) {
    		imgView2.setImage(userPickedImg);
    		userPlay();
    	}
    }

    public void setImgView3() {
    	if(imgView3.getImage() == null) {
    		imgView3.setImage(userPickedImg);
    		userPlay();
    	}
    }
    
    public void setImgView4() {
    	if(imgView4.getImage() == null) {
    		imgView4.setImage(userPickedImg);
    		userPlay();
    	}
    }
    
    public void setImgView5() {
    	if(imgView5.getImage() == null) {
    		imgView5.setImage(userPickedImg);
    		userPlay();
    	}
    }
    
    public void setImgView6() {
    	if(imgView6.getImage() == null) {
    		imgView6.setImage(userPickedImg);
    		userPlay();
    	}
    }
    
    public void setImgView7() {
    	if(imgView7.getImage() == null) {
    		imgView7.setImage(userPickedImg);
    		userPlay();
    	}
    }
    
    public void setImgView8() {
    	if(imgView8.getImage() == null) {
    		imgView8.setImage(userPickedImg);
    		userPlay();
    	}
    }
    
    public void setImgView9() {
    	if(imgView9.getImage() == null) {
    		imgView9.setImage(userPickedImg);
    		userPlay();
    	}
    }
}
