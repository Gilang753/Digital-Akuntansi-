<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class PengajuanIjin extends Model
{
    use HasFactory;

    protected $table = 'tb_pengajuanijin';
    protected $primaryKey = 'id_pengajuan';

    protected $fillable = [
        'id_pegawai',
        'id_jenisijin',
        'tanggalPengajuan',
        'statusPengajuan',
    ];

    public function pegawai()
    {
        return $this->belongsTo(Pegawai::class, 'id_pegawai');
    }

    public function jenisIjin()
    {
        return $this->belongsTo(JenisIjin::class, 'id_jenisijin');
    }
}
