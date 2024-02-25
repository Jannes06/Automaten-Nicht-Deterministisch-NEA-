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
      Q2  q2 = new Q2();
      Q0  q0 = new Q0();
      List folgezustaende = new List<Zustand>();
      folgezustaende.append(q2);
      folgezustaende.append(q0);
      return folgezustaende;


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
      Q3  q3 = new Q3();
      Q0  q0 = new Q0();
      List folgezustaende = new List<Zustand>();
      folgezustaende.append(q3);
      folgezustaende.append(q0);
      return folgezustaende;
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
      Q0  q0 = new Q0();
      List folgezustaende = new List<Zustand>();
      folgezustaende.append(q0);
      return folgezustaende;
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
