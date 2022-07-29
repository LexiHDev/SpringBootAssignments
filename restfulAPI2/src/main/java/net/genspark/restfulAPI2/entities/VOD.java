package net.genspark.restfulAPI2.entities;

import net.genspark.restfulAPI2.controllers.PlayerController;
import net.genspark.restfulAPI2.dao.PlayerDAO;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Currency;

@Entity @Table(name = "tbl_vods")
public class VOD
{
	private @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "VOD_ID") long id;
	private @Column(name="VOD_Name") String name;
	private @Column(name="Game_SR") String sr;
	
	@ManyToOne(fetch = FetchType.EAGER,optional = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name="player_id", nullable = false)
	private Player player;
	
	public VOD() { }
	public VOD(long id, String name, String sr, Player player)
	{
		this.id = id;
		this.name = name;
		this.sr = sr;
		this.player = player;
	}
	
	
	public Player getPlayer()
	{
		return player;
	}
	public void setPlayer(Player player)
	{
		this.player = player;
	}
	public String getSr()
	{
		return sr;
	}
	public void setSr(String sr)
	{
		this.sr = sr;
	}
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
