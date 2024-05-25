

<?php $__env->startSection('content'); ?>
<div class="container">
    <h1>Data Pengajuan Ijin</h1>
    <a href="<?php echo e(route('pengajuanijin.create')); ?>" class="btn btn-primary">Tambah Pengajuan Ijin</a>
    <table class="table">
        <thead>
            <tr>
                <th>ID</th>
                <th>ID Pegawai</th>
                <th>ID Jenis Ijin</th>
                <th>Tanggal Pengajuan</th>
                <th>Status Pengajuan</th>
                <th>Aksi</th>
            </tr>
        </thead>
        <tbody>
            <?php $__currentLoopData = $tb_pengajuanijin; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $pengajuanijin): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
            <tr>
                <td><?php echo e($pengajuanijin->id_pengajuan); ?></td>
                <td><?php echo e($pengajuanijin->id_pegawai); ?></td>
                <td><?php echo e($pengajuanijin->id_jenisijin); ?></td>
                <td><?php echo e($pengajuanijin->tanggalPengajuan); ?></td>
                <td><?php echo e($pengajuanijin->statusPengajuan); ?></td>
                <td>
                    <a href="<?php echo e(route('pengajuanijin.show', $pengajuanijin->id_pengajuan)); ?>" class="btn btn-info">View</a>
                    <a href="<?php echo e(route('pengajuanijin.edit', $pengajuanijin->id_pengajuan)); ?>" class="btn btn-warning">Edit</a>
                    <form action="<?php echo e(route('pengajuanijin.destroy', $pengajuanijin->id_pengajuan)); ?>" method="POST" style="display:inline;">
                        <?php echo csrf_field(); ?>
                        <?php echo method_field('DELETE'); ?>
                        <button type="submit" class="btn btn-danger">Delete</button>
                    </form>
                </td>
            </tr>
            <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); ?>
        </tbody>
    </table>
</div>
<?php $__env->stopSection(); ?>

<?php echo $__env->make('dashboard', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\xampp\htdocs\SISDM_Perusahaan\resources\views/pengajuanijin/index.blade.php ENDPATH**/ ?>