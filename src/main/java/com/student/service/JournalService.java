package com.student.service;

import com.student.dao.entity.JournalEntity;
import com.student.dao.repository.JournalRepository;
import com.student.dto.JournalDto;
import com.student.exception.NotFoundAuthor;
import com.student.exception.NotFoundCount;
import com.student.exception.NotFoundPrice;
import com.student.exception.NotFoundTitle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JournalService {
    private final JournalRepository journalRepository;

//public void addJournal(JournalDto dto){
//    if(dto.getTitle().trim().isEmpty())
//        throw new NotFoundTitle("Ad bos ola bilmez");
//
//    if(dto.getAuthor().trim().isEmpty())
//        throw new NotFoundAuthor("Yazar adi bos ola bilmez");
//
//    if(dto.getPrice()<=0)
//        throw new NotFoundPrice("Qiymet 0-dan kicik ola bilmez");
//
//    if(dto.getCount()<=0)
//        throw new NotFoundCount("Jurnal sayi 0 ola bilmez");
//}

public void addJour(JournalEntity entity){
    journalRepository.save(entity);
}
}
