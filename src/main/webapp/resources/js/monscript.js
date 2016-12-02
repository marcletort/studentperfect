function showMessage() {
	if (confirm('Are you sure you want to create this student?')) return "#{studentController.addStudent(student)}"
}
