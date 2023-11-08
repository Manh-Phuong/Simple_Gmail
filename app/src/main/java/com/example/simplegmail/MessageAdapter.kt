import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.simplegmail.MessageModel
import com.example.simplegmail.R

class MessageAdapter(private val messages: List<MessageModel>) : RecyclerView.Adapter<MessageAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val content: TextView = itemView.findViewById(R.id.content)
        val ownerName: TextView = itemView.findViewById(R.id.owner)
        val userName: TextView = itemView.findViewById(R.id.text_user_name)
        val time: TextView = itemView.findViewById(R.id.time)
        val cardView: CardView = itemView.findViewById(R.id.card_view_2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.message_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return messages.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val message = messages[position]

        holder.content.text = message.content
        holder.ownerName.text = message.ownerName
        holder.userName.text = message.ownerName[0].toString()
        holder.time.text = message.time

        val backgroundColors = listOf("#5a99fa", "#fb8c67", "#9acd68", "#92a3ad", "#8C33FF")
        val color = Color.parseColor(backgroundColors[position % backgroundColors.size])
        holder.cardView.setCardBackgroundColor(color)
    }
}
