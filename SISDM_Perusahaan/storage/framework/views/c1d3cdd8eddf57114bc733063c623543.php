

<?php $__env->startSection('content'); ?>
<div class="container">
    <h1>Data Pegawai</h1>
    <a href="<?php echo e(route('pegawai.create')); ?>" class="btn btn-primary">Tambah Pegawai</a>
    <table class="table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nama</th>
                <th>Tanggal Lahir</th>
                <th>Usia</th>
                <th>Alamat</th>
                <th>Jenis Kelamin</th>
                <th>Status</th>
            </tr>
        </thead>
        <tbody>
            <?php $__currentLoopData = $tb_pegawai; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $pegawai): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
            <tr>
                <td><?php echo e($pegawai->id_pegawai); ?></td>
                <td><?php echo e($pegawai->nama); ?></td>
                <td><?php echo e($pegawai->tanggal_lahir); ?></td>
                <td><?php echo e($pegawai->usia); ?></td>
                <td><?php echo e($pegawai->alamat); ?></td>
                <td><?php echo e($pegawai->jenis_kelamin); ?></td>
                <td><?php echo e($pegawai->status); ?></td>
                <td>
                    <a href="<?php echo e(route('pegawai.show', $pegawai->id_pegawai)); ?>" class="btn btn-info">View</a>
                    <a href="<?php echo e(route('pegawai.edit', $pegawai->id_pegawai)); ?>" class="btn btn-warning">Edit</a>
                    <form action="<?php echo e(route('pegawai.destroy', $pegawai->id_pegawai)); ?>" method="POST" style="display:inline;">
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

<?php echo $__env->make('dashboard', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\xampp\htdocs\SISDM_Perusahaan\resources\views/pegawai/index.blade.php ENDPATH**/ ?>