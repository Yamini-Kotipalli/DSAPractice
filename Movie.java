package Dsa_practice;

public class Movie {
private String name;
private int cost;
public void setCost(int cost) {
	if(cost>0) {
	this.cost=cost;
	}
	else {
		System.out.println("Invalid cost");
	}
}
public int getCost() {
	return cost;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
}
