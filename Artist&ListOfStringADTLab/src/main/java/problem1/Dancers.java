package problem1;

/**
 * This is Dancers class which is the subclass of the ActingPerson with name, age, genres, award,
 * movies, series, multimedia
 */
public class Dancers extends ActingPerson {

  /**
   * Constructor for Dancers, dancer object with name, age, genres, award, movies, series,
   * multimedia
   *
   * @param name       - Name, name class
   * @param age        - age, integer
   * @param genres     - genres, string array
   * @param award      - all award, string array
   * @param movies     - all movies they worked on, string array
   * @param series     - all TV series they worked on, string array
   * @param multimedia - all other multimedia they worked on, string array
   * @throws InvalidAgeException when age is out of range
   */
  public Dancers(Name name, Integer age, String[] genres, String[] award, String[] movies,
      String[] series, String[] multimedia) throws InvalidAgeException {
    super(name, age, genres, award, movies, series, multimedia);
  }
}
