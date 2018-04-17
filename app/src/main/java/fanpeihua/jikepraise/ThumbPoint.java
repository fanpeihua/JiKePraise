package fanpeihua.jikepraise;

public class ThumbPoint {
    float x;
    float y;

    public ThumbPoint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThumbPoint thumbPoint = (ThumbPoint) obj;
        if (x != thumbPoint.x) return false;
        if (y != thumbPoint.y) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = Float.floatToIntBits(x);
        result = 31 * result + Float.floatToIntBits(y);
        return result;
    }

    @Override
    public String toString() {
        return "ThumbPoint(" + x + "," + y + ")";
    }
}
