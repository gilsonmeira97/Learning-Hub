import { Injectable } from '@nestjs/common';
import { CreateSongDTO } from './dto/create-song-dto';

@Injectable()
export class SongsService {
    private readonly songs: CreateSongDTO[] = [];

    create(song: CreateSongDTO) {
        this.songs.push(song);
        return song;
    }
    findAll() {
        return this.songs
    }
}
