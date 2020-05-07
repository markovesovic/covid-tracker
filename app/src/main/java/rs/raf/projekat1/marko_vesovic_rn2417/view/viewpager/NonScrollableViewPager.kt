package rs.raf.projekat1.marko_vesovic_rn2417.view.viewpager

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

class NonScrollableViewPager(context: Context, attrs: AttributeSet) : ViewPager(context, attrs) {
    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return false
    }
    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return false
    }
}