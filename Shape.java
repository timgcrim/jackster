public class Shape{
    private int x;
    private int y;
    private int w;
    private int h;
    public int vx;
    public int vy;
    private int lastX;
    private int lastY;

    public Shape(int x,int y,int w,int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.vx = 5;
        this.vy = 5;
        lastX = 0;
        lastY = 0;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getWidth(){
        return w;
    }

    public int getHeight(){
        return h;
    }
    
    public void move(){
        lastX = x;
        lastY = y;
        x += vx;
        y += vy;
        if (x >= 800||x<=0-w){
            vx *= -1;
        }
        if (y >= 800||y<=0-h){
            vy *= -1;
        }
    }

    public void checkCollision(Shape other){
        if (other.x>this.lastX&&other.vx>0&&this.y+this.h>=other.y){
            other.vx *= -1;
            if (this.vx < 0){
                this.vx *= -1;
            }
        }
        if (other.x<this.lastX&&other.vx<0&&this.y+this.h>=other.y){
            other.vx *= -1;
            if (this.vx > 0){
                this.vx *= -1;
            }
        }
        if (other.y>this.lastY&&other.vy>0&&this.x+this.w>=other.x){
            other.vy *= -1;
            if (this.vy < 0){
                this.vy *= -1;
            }
        }
        if (other.y<this.lastY&&other.vy<0&&this.x+this.w>=other.x){
            other.vy *= -1;
            if (this.vy > 0){
                this.vy *= -1;
            }
        }
    }

}