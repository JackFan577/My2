package jack.my2;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class RectBar extends View {
    
    
    private Paint paint = new Paint();

    
    public RectBar(Context context) { super(context);}
    
    public RectBar(Context context, AttributeSet attrs){ super(context, attrs);}
    
    
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        
        
        
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(1f);
        
        canvas.drawRect(0, 0, 500, 500, paint);
        
    }
    
  
}
