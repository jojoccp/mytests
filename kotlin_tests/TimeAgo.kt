import java.lang.StringBuilder
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.TextStyle
import java.time.temporal.ChronoUnit
import java.util.*

fun main(args: Array<String>) {

    val currentDateTime = LocalDateTime.now()
    val commentDateTime = LocalDateTime.parse("2021-05-29T18:26:00.000")
    println("Data Atual: " + currentDateTime)
    println("Data do Comentário: " +  commentDateTime)
    println("Diferença entre Datas: " + ChronoUnit.MINUTES.between(commentDateTime, currentDateTime))
    print("----------------------------Comentários: ")
    println(getCommentTimeAgo(commentDateTime, currentDateTime))
    print("----------------------------Respostas: ")
    println(getCommentAnswerTimeAgo(commentDateTime, currentDateTime))
    print("----------------------------Conteúdos: ")
    println(getContentTimeAgo(commentDateTime, currentDateTime))

}

fun getCommentTimeAgo(commentDateTime: LocalDateTime, currentDateTime: LocalDateTime ): String {
    var minutesApart: Long = ChronoUnit.MINUTES.between(commentDateTime, currentDateTime)
    var hoursApart: Long = ChronoUnit.HOURS.between(commentDateTime, currentDateTime)
    var daysApart: Long = ChronoUnit.DAYS.between(commentDateTime, currentDateTime)
    var monthName: Locale = Locale("pt", "BR")

    return when {
        minutesApart < 1L -> "Poucos segundos atrás"
        minutesApart == 1L -> "" + minutesApart + " minuto atrás"
        minutesApart in 2L..59L -> "" + minutesApart + " minutos atrás"
        hoursApart == 1L -> "" + hoursApart + " hora atrás"
        hoursApart in 2L..23L -> "" + hoursApart + " horas atrás"
        hoursApart in 24L..48L && currentDateTime.dayOfMonth == commentDateTime.plusDays(1).dayOfMonth  -> "Ontem às " + commentDateTime.hour + ":" +  if(commentDateTime.minute < 10)  "0" + commentDateTime.minute  else "" + commentDateTime.minute
        daysApart in 1L..365L -> "" + commentDateTime.dayOfMonth + "/"  + commentDateTime.month.getDisplayName(TextStyle.FULL, monthName)
        daysApart > 365L -> "" + commentDateTime.dayOfMonth + "/"  + commentDateTime.month.getDisplayName(TextStyle.FULL, monthName) + "/" + commentDateTime.year
        else -> "erro"
    }
}

fun getCommentAnswerTimeAgo(commentDateTime: LocalDateTime, currentDateTime: LocalDateTime ): String {
    var minutesApart: Long = ChronoUnit.MINUTES.between(commentDateTime, currentDateTime)
    var hoursApart: Long = ChronoUnit.HOURS.between(commentDateTime, currentDateTime)
    var daysApart: Long = ChronoUnit.DAYS.between(commentDateTime, currentDateTime)

    return when {
        minutesApart < 1L -> "Poucos segundos atrás"
        minutesApart == 1L -> "" + minutesApart + " minuto atrás"
        minutesApart in 1L..59L -> "" + minutesApart + " minuto atrás"
        hoursApart == 1L -> "" + hoursApart + " hora atrás"
        daysApart == 1L -> "" + daysApart + " dia atrás"
        daysApart in 2L..30L -> "" + daysApart + " dias atrás"
        daysApart/30 == 1L -> "" + daysApart/30 + " mês atrás"
        daysApart/30  in 2L..11L ->   "" + daysApart/30 + " meses atrás"
        daysApart/365 == 1L -> "" + daysApart/365 + " ano atrás"
        daysApart/365 > 1L -> "" + daysApart/365 + " anos atrás"
        else -> "erro"
    }
}

fun getContentTimeAgo(contentDateTime: LocalDateTime, currentDateTime: LocalDateTime ): String {
    var minutesApart: Long = ChronoUnit.MINUTES.between(contentDateTime, currentDateTime)
    var hoursApart: Long = ChronoUnit.HOURS.between(contentDateTime, currentDateTime)
    var daysApart: Long = ChronoUnit.DAYS.between(contentDateTime, currentDateTime)

    return when {
        minutesApart < 1L -> "Poucos segundos atrás"
        minutesApart == 1L -> "" + minutesApart + " minuto atrás"
        minutesApart in 1L..59L -> "" + minutesApart + " minuto atrás"
        hoursApart == 1L -> "" + hoursApart + " hora atrás"
        daysApart == 1L -> "" + daysApart + " dia atrás"
        daysApart in 2L..30L -> "" + daysApart + " dias atrás"
        daysApart/30 == 1L -> "" + daysApart/30 + " mês atrás"
        daysApart/30  in 2L..11L ->   "" + daysApart/30 + " meses atrás"
        daysApart/365 == 1L -> "" + daysApart/365 + " ano atrás"
        daysApart/365 > 1L -> "" + daysApart/365 + " anos atrás"
        else -> "erro"
    }
}