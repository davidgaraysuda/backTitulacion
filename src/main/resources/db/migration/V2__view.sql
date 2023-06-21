CREATE VIEW company_view as
    select c.*,t.name tutor
    from company c JOIN tutor t
    ON c.tutor_id = t.id;

CREATE VIEW student_view as
    select s.*,ca.name career
    from student s JOIN career ca
    ON s.career_id=ca.id;

 CREATE VIEW activity_view as
    select ac.*,c.name carrera
    from activity ac JOIN career c
    ON ac.career_id=c.id;

CREATE VIEW practice_view as
    select  p.*,s.name estudiante , t.name profesor, tu.name tutor,st.lastname apellido, ac.description
    from practice p JOIN teacher t ON p.teacher_id =t.id
                    JOIN tutor tu ON p.tutor_id =tu.id
                    JOIN student s ON p.student_id =s.id
                    JOIN student st ON p.student_id=st.id
                    JOIN activity ac ON p.activity_id=ac.id;

CREATE VIEW activity_detail_view as
  select ad.*,a.description actividad
 from activity_detail ad JOIN activity a ON ad.activities_id = a.id;

CREATE VIEW agreement_view as
select  ag.*, c.name company
from agreement ag JOIN company c ON ag.company_id=c.id;

CREATE VIEW teacher_view as
select te.*,ca.name career
from teacher te JOIN career ca
                  ON te.career_id = ca.id;

CREATE VIEW specific_view as
select  sp.*, ag.company_id company, ca.name career, te.name teacher
from specific_agreement sp JOIN agreement ag ON sp.agreement_id =ag.id
                           JOIN career ca ON sp.career_id=ca.id
                           JOIN teacher te ON sp.teacher_id=te.id









