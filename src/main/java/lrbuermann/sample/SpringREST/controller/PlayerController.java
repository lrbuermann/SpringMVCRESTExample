package lrbuermann.sample.SpringREST.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lrbuermann.sample.SpringREST.DataAccess.PlayerDAO;
import lrbuermann.sample.SpringREST.beans.Player;

@RestController
public class PlayerController {
	@RequestMapping("/player")
	public Player playerByName(@RequestParam(value="firstName")String firstName,@RequestParam(value="lastName")String lastName){
		return new Player(firstName,lastName,"Twins","Catcher");
	}
	@RequestMapping("/allplayers")
	public List<Player> allPlayers(){
		return PlayerDAO.getAllPlayers();
	}
}
