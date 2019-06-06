public class Planet{
    double xxPos;
    double yyPos;
    double xxVel;
    double yyVel;
    double mass;
    static final double G = 6.67e-11;
    String imgFileName;

    public Planet(double xP, double yP, double xV, double yV, double m, String img){
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }

    public Planet(Planet p){
        xxPos = p.xxPos;
        yyPos = p.yyPos;
        xxVel = p.xxVel;
        yyVel = p.yyVel;
        mass = p.mass;
        imgFileName = p.imgFileName;
    }


    public double calcDistance(Planet other){
        double R = Math.sqrt((this.xxPos - other.xxPos) * (this.xxPos - other.xxPos) + (this.yyPos - other.yyPos) * (this.yyPos - other.yyPos));
        return R;
    }

}