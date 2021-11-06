package self_practice

abstract class Notification

case class Email(sender: String, title: String, body: String) extends Notification
case class SMS(caller: String, message: String) extends Notification
case class VoiceRecording(contactName: String, link: String) extends Notification

object CASE{
  def main(args: Array[String]): Unit = {
    def showNotification(notification: Notification): String = {
      notification match {
        case Email(email, title, _) =>
          s"You got an email from $email with title: $title"
        //模式守卫，可以在模式后面加上if
        case SMS(number, message) if message.contains("we") =>
          s"You got an SMS from $number! Message: $message"
        case VoiceRecording(name, link) =>
          s"you received a Voice Recording from $name! Link: $link"
        case other =>
          s"nothing matched!"
      }
    }

    val someSms: SMS = SMS("12345", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")

    println(showNotification(someSms))  // prints You got an SMS from 12345! Message: Are you there?
    println(showNotification(someVoiceRecording))  // you received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123
  }

}