package net.genspark.restfulAPI2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public @Entity @Table(name = "tbl_players") class Player
{
	private @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "Player_ID") long player_id;
	private @Column(name="Player_Name") String name;
	private @Column(name="Player_Rank") String rank;
	private @Column(name="Player_Nickname") String nickname;
	
	Player() {}
	
	public Player(long player_id, String name, String rank, String nickname) {
		this.name = name;
		this.player_id = player_id;
		this.rank = rank;
		this.nickname = nickname;
	}
	
	public long getPlayer_id()
	{
		return player_id;
	}
	public String getNickname()
	{
		return nickname;
	}
	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}
	public void setPlayer_id(long player_id)
	{
		this.player_id = player_id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getRank()
	{
		return rank;
	}
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	
	
}
