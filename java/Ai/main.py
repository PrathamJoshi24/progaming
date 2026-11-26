apikey = __import__('os').environ['OPENAI_API_KEY']

import openai

openai.api_key = apikey

completion = openai.Completion()


def ai(question):
    prompt = f'Pratham: {question}\n Navis: '
    response = completion.create(prompt=prompt, engine="text-davinci-002", stop=['\Pratham'], max_tokens=200)
    answer = response.choices[0].text.strip()
    return awnser
    
q = input(">")
while True:
    if q == x:
        break
    else:
        print(ai(q))