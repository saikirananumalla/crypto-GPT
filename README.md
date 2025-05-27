# 💬 Crypto GPT — AI-Powered Cryptocurrency Assistant

Crypto GPT is an AI-enhanced web platform that helps users explore cryptocurrency trends, prices, and insights through a smart chat interface. The backend fetches real-time data, handles GraphQL queries and subscriptions, and uses the OpenAI API to answer crypto-specific queries intelligently.

---

## 🚀 Features

- 📈 Real-time prices of top 20 cryptocurrencies via public crypto APIs
- 🤖 Chatbot powered by ChatGPT API (crypto-related queries only)
- 👤 User authentication with persistent sessions
- 💬 GraphQL Subscriptions for real-time messaging
- 🗂 Chat history stored per user
- 🔐 Role-based access & session tracking

---

## 🛠 Tech Stack

**Backend**:
- Java, Spring Boot
- GraphQL (with Subscriptions, Queries, Mutations)
- OpenAI ChatGPT API
- PostgreSQL (session and chat history)
- Spring Security + JWT

**Frontend**:
- React (Crypto dashboard + Chat interface)
- Axios, Apollo Client

**DevOps**:
- Docker (multi-stage build)
- AWS S3 + CloudFront for frontend deployment
- EC2 + Kubernetes (k8s) for backend deployment
- Kafka (for async logging/notifications)
- GitHub Actions for CI/CD

---

## 📦 Setup Instructions

### Backend

```bash
# Build & run the backend
cd backend
./mvnw clean package
java -jar target/crypto-gpt.jar
