public class AutomatNEA {
  
  private Zustand startzustand;
  private List<Zustand> aktiveZustaende;

  
  public class Q0 extends Zustand {
    
    public Q0() {
      super();

    }
    
    public List<Zustand> gibFolgezustaende1() {  //Hier weitermachen
     Q1  q1 = new Q1();
     List folgezustaende = new List<Zustand>();
        folgezustaende.append(q1);
      return folgezustaende;

    }
    
    public boolean istEndzustand() {
      return true;
    }
    
  }
  
  public class Q1 extends Zustand {
  
    public Q1() {
      super();
    }

    public List<Zustand> gibFolgezustaende0() {


    }
    
    public boolean istEndzustand() {
      return false;
    }
    
  }

  public class Q2 extends Zustand {
  
    public Q2() {
      super();
    }

    public List<Zustand> gibFolgezustaende1() {
      return Q3;
      return Q0;
    }
    
    public boolean istEndzustand() {
      return false;
    }
    
  }
  
  public class Q3 extends Zustand {
  
    public Q3() {
      super();
    }

    public List<Zustand> gibFolgezustaende0() {
      return null;
    }
    public List<Zustand> gibFolgezustaende1() {
      return Q0;
    }


    public boolean istEndzustand() {
      return false;
    }
    
  }
  
  public void pruefeWort(String pWort) {
    
  }

  public boolean akzeptiert() {
    return false;
  }
  
}
