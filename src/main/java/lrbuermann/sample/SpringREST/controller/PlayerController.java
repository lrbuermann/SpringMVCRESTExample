package lrbuermann.sample.SpringREST.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lrbuermann.sample.SpringREST.DataAccess.PlayerDAO;
import lrbuermann.sample.SpringREST.beans.Player;
/**
 * 
 * @author lrbuermann
 * @version 1.0.0 7/23/2015
 * This is the controller class for the REST service
 * Each method here corresponds to a specific endpoint
 *
 */
@RestController
public class PlayerController {
	/**
	 * This is an incomplete method
	 * This method is accessed via the /api/player endpoint. It expects two query params
	 * One for firstName and one for lastName of the player being requested.
	 * The @requestmapping annotation defines the endpoint. By default this 
	 * endpoint is expecting GET requests.
	 * 
	 * @param firstName the first name of the player
	 * @param lastName the last name of the player
	 * @return Player the player that matches the first name and last name
	 */
	@RequestMapping("/player")
	public Player playerByName(@RequestParam(value="firstName")String firstName,@RequestParam(value="lastName")String lastName){
		return new Player(firstName,lastName,"Twins","Catcher");
	}
	/**
	 * This method will return all players in the database
	 * Its accessed by sending a GET request to /api/allplayers
	 * @return List of all players in the database
	 */
	@RequestMapping("/allplayers")
	public List<Player> allPlayers(){
		return PlayerDAO.getAllPlayers();
	}
}
