package in.pbaldu.cba;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CityReader {
  private final String filename;

  public CityReader(String filename) {
    this.filename = filename;
  }

  public List<City> readAll() throws IOException {
    List<City> list = new ArrayList<>();

    BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));

    String line;

    while ((line = reader.readLine()) != null) {
      String[] parts = line.split(",");

      list.add(new City(parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3])));
    }

    reader.close();

    return list;
  }
}
