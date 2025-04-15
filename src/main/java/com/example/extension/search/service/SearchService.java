package com.example.extension.search.service;

public class SearchService {

    // 1. gpt를 통해 검색어를 새로 만드는 기능
    // 2. 인증 확인 및 사용 횟수 체크
    // 3. 필터 생성 등 기타 편의기능
}

// 환경변수에서 api key를 받아와서 추천 검색어 추출
// 아래는 python으로 얼굴 특징 추출하는 코드
// https://github.com/seunghok22/flyai-repo/blob/main/character/views.py
//def analyze_image(image_bytes, gender):
//        """GPT-4 Vision을 이용해 얼굴 분석 후 해시태그 추출"""
//        base64_image = resize_image(image_bytes)
//
//        response = openai.ChatCompletion.create(
//        model="gpt-4",
//        messages=[
//        {"role": "system", "content" : "당신은 사람의 이목구비를 분석하고 특징적인 키워드를 해시태그 형식으로 추출하는 전문가입니다. 구어체로 자연스럽게 설명해주세요." },
//        {"role": "system", "content" : "**이 {gender} 사람의 얼굴 특징을 분석하고 주요 얼굴 특징을 해시태그로 추출합니다. 해시태그 형식으로만 작성해주세요.**"},
//        {"role": "user", "content": f"data:image/png;base64,{base64_image}"}
//        ],
//        max_tokens=100
//        )
//        return response["choices"][0]["message"]["content"].strip()
