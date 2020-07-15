import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sallam.task.R
import com.sallam.task.data.remote.MainResponse
import kotlinx.android.synthetic.main.item_car.view.*

class CarsAdapter(
    private val context: Context,
    private val carsList: List<MainResponse.Data>
) :
    RecyclerView.Adapter<CarsAdapter.CarsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_car, parent, false)
        return CarsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return carsList.size
    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        with(holder.itemView) {
            tvModel.text = carsList[position].brand
            tvStatus.text = carsList[position].isUsed.toString()
            Glide.with(context).load(carsList[position].imageUrl).into(ivCar)
        }
    }

    class CarsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}