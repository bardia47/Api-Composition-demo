CREATE TABLE ADDRESS (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  location VARCHAR(64) NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
      user_id INT NOT NULL);