package com.example.gmailapp.helpers

import com.example.gmailapp.R
import com.example.gmailapp.models.Gmail
import org.threeten.bp.LocalDate

object Helper {


    fun provideGmailList(): List<Gmail> {

        return listOf(
            Gmail(
                photo = R.drawable.person,
                name = "Taulant",
                subject = "Meeting Tomorrow",
                shortMessage = "Hey, let's discuss the agenda for our meeting tomorrow.",
                date = LocalDate.of(2023, 10, 2),
                longMessage = "Hi Taulant,\n\nI hope this email finds you well. I wanted to touch base regarding our upcoming meeting scheduled for tomorrow. We have a few important items on the agenda that require your input. Please review the attached documents and come prepared with your thoughts.\n\nLooking forward to our discussion!\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "Altin",
                subject = "Project Status Update",
                shortMessage = "Altin, here's a quick update on the project's status.",
                date = LocalDate.of(2022, 10, 13),
                longMessage = "Dear Altin,\n\nI trust you're doing well. I wanted to provide you with a brief update on the current status of our ongoing project. We've made significant progress in the last few weeks, and I'm pleased to share the details with you.\n\nPlease find the attached project status report for a more in-depth overview. If you have any questions or concerns, feel free to reach out.\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "Nikolin",
                subject = "Invitation to Webinar",
                shortMessage = "Dear Nikolin, you're invited to our upcoming webinar on emerging technologies.",
                date = LocalDate.of(2021, 1, 22),
                longMessage = "Hello Nikolin,\n\nWe hope this email finds you in good health. We would like to extend an invitation to you for our upcoming webinar on the latest trends in emerging technologies. As a valued member of our community, your presence would be highly appreciated.\n\nDate: [Webinar Date]\nTime: [Webinar Time]\nLocation: [Webinar Link]\n\nPlease RSVP at your earliest convenience.\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "Aldi",
                subject = "Job Interview Schedule",
                shortMessage = "Dear Aldi, we are pleased to invite you for a job interview.",
                date = LocalDate.of(2019, 3, 4),
                longMessage = "Dear Aldi,\n\nWe hope this email finds you well. We have reviewed your application for the [Job Title] position and are impressed with your qualifications. We would like to invite you for a job interview to discuss your skills and experiences further.\n\nDate: [Interview Date]\nTime: [Interview Time]\nLocation: [Interview Location]\n\nPlease confirm your availability by replying to this email. We look forward to meeting you!\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User5",
                subject = "Important Announcement",
                shortMessage = "User5, please read this important announcement.",
                date = LocalDate.now().minusDays(5),
                longMessage = "Dear User5,\n\nI hope this message reaches you in good health. We have an important announcement to share with you regarding upcoming changes and improvements to our services. Your feedback is valuable, and we encourage you to reach out with any questions or concerns.\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User6",
                subject = "Vacation Planning",
                shortMessage = "User6, let's plan your upcoming vacation!",
                date = LocalDate.now().minusDays(6),
                longMessage = "Hi User6,\n\nI hope you're doing well. As we approach the holiday season, it's the perfect time to plan your upcoming vacation. Whether you're looking for a relaxing beach getaway or an adventurous mountain retreat, we can help you find the perfect destination.\n\nLet's schedule a meeting to discuss your preferences and plan a memorable vacation!\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User7",
                subject = "Weekly Report Submission",
                shortMessage = "User7, it's time to submit your weekly report.",
                date = LocalDate.now().minusDays(7),
                longMessage = "Dear User7,\n\nI trust you had a productive week. As part of our weekly routine, it's time to submit your progress report. Please compile the necessary information and submit it by [Submission Deadline]. If you encounter any challenges or need assistance, feel free to reach out.\n\nThank you for your diligence!\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User8",
                subject = "Birthday Celebration",
                shortMessage = "User8, we're celebrating your birthday next week!",
                date = LocalDate.now().minusDays(8),
                longMessage = "Hello User8,\n\nWe hope this email brings a smile to your face. Your birthday is just around the corner, and we're planning a special celebration to make it memorable. Please let us know your preferred time and venue, and if there's anything specific you'd like for your birthday.\n\nLooking forward to celebrating with you!\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User9",
                subject = "Training Session Reminder",
                shortMessage = "User9, don't forget about the training session tomorrow.",
                date = LocalDate.now().minusDays(9),
                longMessage = "Hi User9,\n\nI hope this email finds you well. A quick reminder about the training session scheduled for tomorrow. Please come prepared with any questions or topics you'd like to discuss. We're excited to enhance our skills together!\n\nSee you there!\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User10",
                subject = "Product Launch Update",
                shortMessage = "User10, here's the latest update on our product launch.",
                date = LocalDate.now().minusDays(10),
                longMessage = "Dear User10,\n\nI trust you're having a great day. I wanted to share with you the latest update on our upcoming product launch. We've made significant progress, and I'm confident that the market will respond positively. Please review the attached document for more details.\n\nIf you have any questions or suggestions, feel free to reach out.\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User11",
                subject = "Team Building Event",
                shortMessage = "User11, get ready for our team building event next week!",
                date = LocalDate.now().minusDays(11),
                longMessage = "Hello User11,\n\nI hope you're excited as we are for our upcoming team building event scheduled for next week. It's an excellent opportunity for us to bond, collaborate, and have some fun together. Please let us know if you have any preferences or ideas for the event.\n\nLooking forward to a fantastic time!\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User12",
                subject = "Product Feedback Request",
                shortMessage = "User12, we value your opinion! Share your feedback with us.",
                date = LocalDate.now().minusDays(12),
                longMessage = "Hi User12,\n\nWe hope this email finds you well. We're reaching out to you because your feedback is important to us. As a valued customer, your insights can help us improve our products and services. Please take a moment to share your thoughts and suggestions with us.\n\nThank you for being a part of our journey!\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User13",
                subject = "Upcoming Conference Invitation",
                shortMessage = "User13, you're invited to our industry conference!",
                date = LocalDate.now().minusDays(13),
                longMessage = "Dear User13,\n\nI trust this message finds you in good health. We are excited to extend an invitation to you for our upcoming industry conference. The event will feature keynote speakers, workshops, and networking opportunities. We believe it will be a valuable experience for you.\n\nPlease confirm your attendance at your earliest convenience.\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User14",
                subject = "New Project Kickoff",
                shortMessage = "User14, get ready for the kickoff of our new project!",
                date = LocalDate.now().minusDays(14),
                longMessage = "Hello User14,\n\nI hope this email finds you in good spirits. Exciting news! We are about to kick off a new project, and your expertise is crucial to its success. Please join us for a kickoff meeting to discuss the project scope, objectives, and timeline.\n\nLooking forward to your valuable contributions!\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User15",
                subject = "Congratulations on Your Achievement",
                shortMessage = "User15, congratulations on your recent achievement!",
                date = LocalDate.now().minusDays(15),
                longMessage = "Dear User15,\n\nI wanted to take a moment to congratulate you on your recent achievement. Your hard work and dedication have not gone unnoticed. Your success is well-deserved, and we're proud to have you on our team.\n\nWishing you continued success in your endeavors!\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User16",
                subject = "Training Workshop Enrollment",
                shortMessage = "User16, enroll now for our upcoming training workshop!",
                date = LocalDate.now().minusDays(16),
                longMessage = "Hi User16,\n\nWe hope you're doing well. We're excited to announce our upcoming training workshop on [Topic]. This is a fantastic opportunity for professional development, and we encourage you to enroll early to secure your spot.\n\nFor more details and enrollment instructions, please refer to the attached document.\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User17",
                subject = "Survey Participation Request",
                shortMessage = "User17, your opinion matters! Participate in our survey.",
                date = LocalDate.now().minusDays(17),
                longMessage = "Dear User17,\n\nWe hope this email finds you well. As part of our commitment to continuous improvement, we invite you to participate in our customer satisfaction survey. Your feedback is invaluable, and it will help us enhance our products and services.\n\nThank you for taking the time to share your thoughts.\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User18",
                subject = "Collaboration Opportunity",
                shortMessage = "User18, let's explore potential collaboration opportunities.",
                date = LocalDate.now().minusDays(18),
                longMessage = "Hello User18,\n\nI trust this email finds you in good health. I am reaching out to discuss potential collaboration opportunities between our organizations. I believe that by combining our strengths, we can achieve mutually beneficial outcomes.\n\nPlease let me know a convenient time for a meeting to explore this further.\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User19",
                subject = "Upcoming Product Launch",
                shortMessage = "User19, get ready for our exciting product launch!",
                date = LocalDate.now().minusDays(19),
                longMessage = "Hi User19,\n\nI hope you're as excited as we are about our upcoming product launch. We have been working tirelessly to bring you a revolutionary product, and we can't wait to share it with you.\n\nSave the date for the launch event and stay tuned for more details!\n\nBest regards,\n[Your Name]"
            ),
            Gmail(
                photo = R.drawable.person,
                name = "User20",
                subject = "Networking Event Invitation",
                shortMessage = "User20, you're invited to our exclusive networking event!",
                date = LocalDate.now().minusDays(20),
                longMessage = "Dear User20,\n\nI trust"
            )
        )
    }

}