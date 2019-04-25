package com.scourtin.revision.persistance.constant;

public class SqlQuery {
	
	/*-------------------------------------------------------------*/
	public static final String SQL_WORD_DELETE="DELETE ";
	public static final String SQL_WORD_UPDATE="UPDATE ";
	public static final String SQL_WORD_INSERT="INSERT INTO ";
	
	/*-------------------------Ingredient------------------------------------*/
	public static final String SQL_QUERY_INGREDIENT = "FROM Ingredient ";
	public static final String SQL_QUERY_INGREDIENT_WHEREBYID = "WHERE id= :idIngredient ";
	
	public static final String SQL_QUERY_INGREDIENT_SELECT = 
			SQL_QUERY_INGREDIENT;
	public static final String SQL_QUERY_INGREDIENT_SELECT_WHERE = 
			SQL_QUERY_INGREDIENT + SQL_QUERY_INGREDIENT_WHEREBYID;
	
	public static final String SQL_QUERY_INGREDIENT_INSERT = 
			SQL_WORD_INSERT + "Ingredient (name) VALUES (:name)";
	public static final String SQL_QUERY_INGREDIENT_UPDATE = 
			SQL_WORD_UPDATE + "Ingredient SET name=:name " + SQL_QUERY_INGREDIENT_WHEREBYID ;
	public static final String SQL_QUERY_INGREDIENT_DELETE = 
			SQL_WORD_DELETE + SQL_QUERY_INGREDIENT + SQL_QUERY_INGREDIENT_WHEREBYID;
	/*-------------------------------------------------------------*/
	
	/*-------------------------RecipeIngredient------------------------------------*/
	/*-------------------------------------------------------------*/
	
	/*-------------------------Recipe------------------------------------*/
	/*-------------------------------------------------------------*/
	
}
