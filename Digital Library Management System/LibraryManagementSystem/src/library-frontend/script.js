document.addEventListener('DOMContentLoaded', function() {
    // Fetch all books
    fetch('http://localhost:8080/api/books')
        .then(response => response.json())
        .then(data => {
            const bookListSection = document.getElementById('bookList');
            data.forEach(book => {
                const bookElement = document.createElement('div');
                bookElement.innerHTML = `
                    <h3>${book.title}</h3>
                    <p>Author: ${book.author}</p>
                    <p>ISBN: ${book.isbn}</p>
                `;
                bookListSection.appendChild(bookElement);
            });
        })
        .catch(error => console.error('Error fetching books:', error));

    // Example: Add a new book
    const addBookForm = document.getElementById('addBookForm');
    addBookForm.addEventListener('submit', function(event) {
        event.preventDefault();
        const formData = new FormData(addBookForm);
        const newBook = {
            title: formData.get('title'),
            author: formData.get('author'),
            isbn: formData.get('isbn')
        };

        fetch('http://localhost:8080/api/books', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(newBook)
        })
        .then(response => response.json())
        .then(data => {
            console.log('Book added:', data);
            // Optionally update UI or notify user
        })
        .catch(error => console.error('Error adding book:', error));
    });
});
