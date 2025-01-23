public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String language;
  private String imageFile;

  // add constructors
  public Country (String name, String capital, String language, String imageFile){
		this.name = name;
		this.capital = capital;
		this.language = language;
		this.imageFile = imageFile;
	}

  public Country(){
    name = "";
    capital = "";
    language = "";
    imageFile = "";
  }

  // Write accessor/get methods for each instance variable that returns it.
  public String getName() {
		return name;
	}

  public String getCapital() {
		return capital;
	}

  public String getLanguage() {
		return language;
	}

  public String getImageFile() {
		return imageFile;
	}

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 //post condition: returns a string describing the capital and  language of a country
  public String toString() {
  String a = name + "'s capital is " + capital + " and its primary language is " + language;
  return a;
  }

  
}