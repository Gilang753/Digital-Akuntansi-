

<?php $__env->startSection('content'); ?>
<div class="container">
    <h1>Data Pengguna</h1>
    <a href="<?php echo e(route('pengguna.create')); ?>" class="btn btn-primary">Tambah Pengguna</a>
    <table class="table">
        <thead>
            <tr>
                <th>ID</th>
                <th>ID Pegawai</th>
                <th>Username</th>
                <th>Password</th>
            </tr>
        </thead>
        <tbody>
            <?php $__currentLoopData = $tb_pengguna; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $pengguna): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
            <tr>
                <td><?php echo e($pengguna->id_pengguna); ?></td>
                <td><?php echo e($pengguna->id_pegawai); ?></td>
                <td><?php echo e($pengguna->username); ?></td>
                <td>
                    <a href="<?php echo e(route('pengguna.show', $pengguna->id_pengguna)); ?>" class="btn btn-info">View</a>
                    <a href="<?php echo e(route('pengguna.edit', $pengguna->id_pengguna)); ?>" class="btn btn-warning">Edit</a>
                    <form action="<?php echo e(route('pengguna.destroy', $pengguna->id_pengguna)); ?>" method="POST" style="display:inline;">
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

<?php echo $__env->make('dashboard', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\xampp\htdocs\SISDM_Perusahaan\resources\views/pengguna/index.blade.php ENDPATH**/ ?>