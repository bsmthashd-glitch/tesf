package Assignment_2;

public class PDF {

    /*❓ الفرق بين Adjacency List و Adjacency Matrix في تمثيل Graph
✅ Adjacency Matrix
    تمثيل الرسم البياني باستخدام مصفوفة ثنائية الأبعاد
            الحجم = V × V (عدد الرؤوس)
    إذا كانت القيمة 1 → يوجد حافة
    إذا كانت 0 → لا يوجد
    المميزات:
    سهل التنفيذ
    فحص وجود حافة يتم بسرعة O(1)
    العيوب:
    يستهلك ذاكرة كبيرة
    غير مناسب للـ Sparse Graph
✅ Adjacency List
    كل رأس له قائمة بالرؤوس المتصلة به
    يستخدم Linked List أو ArrayList
    المميزات:
    أقل استهلاكًا للذاكرة
    مناسب للـ Sparse Graph
    العيوب:
    فحص وجود حافة أبطأ من المصفوفة*/
}
