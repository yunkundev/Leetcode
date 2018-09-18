class Solution 
{

    double r;
    double x;
    double y;
    
    public Solution(double radius, double x_center, double y_center)
    {
        r = radius;
        x = x_center;
        y = y_center;
    }
    
    public double[] randPoint() 
    {
        double ang = Math.random()*360;
        double p = Math.toRadians(ang);
        double rl = Math.sqrt(Math.random())*r;
        double y1 = Math.sin(p)*rl;
        double x1 = Math.cos(p)*rl;
        return new double[]{x+x1, y+y1};
       
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */