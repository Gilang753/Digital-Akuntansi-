

<?php $__env->startSection('content'); ?>
<div class="container">
    <h1>Detail Pegawai</h1>
    <table class="table">
        <tr>
            <th>ID Pegawai</th>
            <td><?php echo e($pegawai->id_pegawai); ?></td>
        </tr>
        <tr>
            <th>Nama</th>
            <td><?php echo e($pegawai->nama); ?></td>
        </tr>
        <tr>
            <th>Tanggal Lahir</th>
            <td><?php echo e($pegawai->tanggal_lahir); ?></td>
        </tr>
        <tr>
            <th>Usia</th>
            <td><?php echo e($pegawai->usia); ?></td>
        </tr>
        <tr>
            <th>Alamat</th>
            <td><?php echo e($pegawai->alamat); ?></td>
        </tr>
        <tr>
            <th>Jenis Kelamin</th>
            <td><?php echo e($pegawai->jenis_kelamin); ?></td>
        </tr>
        <tr>
            <th>Status</th>
            <td><?php echo e($pegawai->status); ?></td>
        </tr>
    </table>
    <a href="<?php echo e(route('pegawai.index')); ?>" class="btn btn-secondary">Back</a>
</div>
<?php $__env->stopSection(); ?>

<?php echo $__env->make('dashboard', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\xampp\htdocs\SISDM_Perusahaan\resources\views/pegawai/show.blade.php ENDPATH**/ ?>