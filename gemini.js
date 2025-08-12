// File: /api/gemini.js

export default async function handler(request, response) {
  // Получаем текст промпта из запроса от Tampermonkey
  const { prompt } = request.body;

  if (!prompt) {
    return response.status(400).json({ error: 'Prompt is required' });
  }

  // Ваш API ключ лучше хранить в переменных окружения Vercel
  const API_KEY = process.env.GEMINI_API_KEY;
  const MODEL_NAME = 'gemini-2.5-flash';
  const API_URL = `https://generativelanguage.googleapis.com/v1beta/models/${MODEL_NAME}:generateContent?key=${API_KEY}`;

  try {
    const geminiResponse = await fetch(API_URL, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({
        contents: [{ parts: [{ text: prompt }] }],
      }),
    });

    if (!geminiResponse.ok) {
      // Если Google вернул ошибку, пересылаем ее клиенту
      const errorData = await geminiResponse.json();
      return response.status(geminiResponse.status).json(errorData);
    }

    const data = await geminiResponse.json();
    // Отправляем чистый ответ обратно в скрипт
    response.status(200).json(data);

  } catch (error) {
    response.status(500).json({ error: 'Failed to fetch from Gemini API' });
  }
}
