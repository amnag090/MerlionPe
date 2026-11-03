package com.currency.sgdtoinr

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import java.text.SimpleDateFormat
import java.util.*

class SgdInrWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    private fun updateAppWidget(context: Context, appWidgetManager: AppWidgetManager, appWidgetId: Int) {
        val views = RemoteViews(context.packageName, R.layout.widget_sgd_inr)

        // Launch app when tapping widget
        val intent = Intent(context, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_IMMUTABLE)
        views.setOnClickPendingIntent(R.id.widget_container, pendingIntent)

        // Today's morning locked rate display
        val timeFormat = SimpleDateFormat("hh:mm a", Locale.getDefault())
        views.setTextViewText(R.id.tv_widget_rate, "1 SGD = ₹73.96")
        views.setTextViewText(R.id.tv_widget_conv, "S$100 = ₹7,396")
        views.setTextViewText(R.id.tv_widget_time, "Locked today • " + timeFormat.format(Date()))

        appWidgetManager.updateAppWidget(appWidgetId, views)
    }
}
